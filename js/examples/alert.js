function multiplyNumeric(obj) {
    for (var key in obj) {
        if (!isNaN(obj[key])) {
            obj[key] = obj[key] * 2;
        }
    }
    return obj;
}

var menu = {
    width: 200,
    height: 300,
    title: "My menu"
};

alert(multiplyNumeric(menu).toString())