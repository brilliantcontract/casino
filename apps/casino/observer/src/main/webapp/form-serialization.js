function serialize(formId) {
    return $("#" + formId).serialize();
}

function marshal(formId) {
    return JSON.stringify($("#" + formId).serializeArray());
}

function unmarshal(jsonCode) {
    var inputs = Array.prototype.slice.call(document.querySelectorAll('input, select'));
    var objectsArray = eval(jsonCode);

    for (var i in objectsArray) {
        let objectName = objectsArray[i]["name"];
        let objectValue = objectsArray[i]["value"];
        
        inputs.map(function (input) {
            inputName = input.name;
            inputValue = input.value;
            inputType = input.type;

            switch (inputType) {
                case "button":
                    return (inputName === objectName) ? (input.value = objectValue) : false;

                case "select-one":
                    return (inputName === objectName) ? (input.value = objectValue) : false;

                case "radio":
                    return (inputName === objectName && inputValue === objectValue) ? (input.checked = true) : false;

                case "checkbox":
                    return (inputName === objectName) ? ((inputValue === objectValue) ? (input.checked = true) : (input.checked = false)) : false;

                default:
                    return (inputName === objectName) ? (input.value = objectValue) : false;
            }
        });
    }
}