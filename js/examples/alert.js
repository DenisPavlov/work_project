var styles = ['Джаз','Блюз'];
alert(styles)
styles.push('Рок-н-Ролл');
alert(styles)
styles[styles.length-2] = 'Классика';
alert(styles)
alert(styles.shift());
styles.unshift('Рэп', 'Регги');
alert(styles)