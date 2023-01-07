package bc.rlt.strategies;

import bc.rlt.essential.CriticalException;
import bc.rlt.essential.ROULETTE_NAME;
import bc.rlt.essential.StrategyTarget;
import bc.rlt.history.Histories;
import bc.rlt.history.History;
import bc.rlt.history.Spin;
import bc.rlt.history.Queue;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Startup;

@Stateless(name = "roulette-mirror-strategy")
@LocalBean
public class RouletteMirrorStrategy implements Strategy {

    @Override
    public Field calculate(ROULETTE_NAME rouletteName, String tableName, StrategyTarget strategyTarget)
            throws CriticalException {
        Field field = initializeField(rouletteName, strategyTarget, tableName);

        Queue<Spin> spins = Histories.create().getHistory(tableName).getSpins();
        switch (strategyTarget) {
            case COLOR:
                field = colorCalculation(spins, field);
                break;

            case PARITY:
                field = parityCalculation(spins, field);
                break;

            case RANGE:
                field = rangeCalculation(spins, field);
                break;

            default:
                throw new CriticalException("Roulette mirror strategy cannot do calculation for " + strategyTarget);
        }

        return field;
    }

    private Field initializeField(ROULETTE_NAME rouletteName, StrategyTarget strategyTarget, String tableName) {
        Field field = new Field();
        field.setRouletteName(rouletteName);
        field.setStrategyTarget(strategyTarget);
        field.setTableName(tableName);

        return field;
    }

    public Field rangeCalculation(Queue<Spin> spins, Field field) {
        return field;
    }

    public Field parityCalculation(Queue<Spin> spins, Field field) {
        return field;
    }

    public Field colorCalculation(Queue<Spin> spins, Field field) {
        Cell previousCell = null;
        for (Spin spin : spins) {
            Cell cell = new Cell();
            cell.setSpin(spin);
            cell.setStatus(spin.getColor().toString());

            cell = doCalculation(cell, previousCell);
            field.cells.add(cell);

            previousCell = cell;
        }

        return field;
    }

    private Cell doCalculation(Cell cell, Cell previousCell) {
        if (previousCell == null) {
            cell.setX(1);
            cell.setY(1);

            return cell;
        }

        if (cell.getStatus().equals(previousCell.getStatus())) {
            cell.setX(previousCell.getX());
            cell.setY(previousCell.getY() + 1);
        } else {
            cell.setX(previousCell.getX() + 1);
            cell.setY(1);
        }

        return cell;
    }

    public String getLocalDateTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_DATE);
    }

}
