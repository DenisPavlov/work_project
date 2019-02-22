var obj = {
    className: 'open menu'
};

function addClass(obj, cls) {
    var array = obj.className.split(" ");
    
    for (i = 0; i < array.length; i++) {
        if (array[i] === cls) return;

        if (i === array.length-1) array.push(cls)
    }

    obj.className = array.join(" ");

    array.filter()
}


addClass(obj, 'new'); // obj.className='open menu new'
addClass(obj, 'open'); // без изменений (класс уже существует)
addClass(obj, 'me'); // obj.className='open menu new me'
alert( obj.className ); // "open menu new me"