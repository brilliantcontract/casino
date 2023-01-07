package bc.rlt.strategies;

import bc.rlt.history.Spin;

public class Cell {

    private Spin spin;
    private Integer x;
    private Integer y;
    private String status;

    public Spin getSpin() {
        return spin;
    }

    public void setSpin(Spin spin) {
        this.spin = spin;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
