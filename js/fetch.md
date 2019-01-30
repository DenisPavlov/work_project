
### <a href="http://learn.javascript.ru/fetch">Описание (Rus)</a>

### Примеры использования

- GET all
```javascript 
    fetch('/message/').then(response => response.json().then(console.log))
```

- GET one
```javascript 
    fetch('/message/2').then(response => response.json().then(console.log))</code>
```

- POST add new one
```javascript
fetch(
  '/message', 
  { 
    method: 'POST', 
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ text: 'Fourth message (4)', id: 10 })
  }
).then(result => result.json().then(console.log))
```

- PUT save existing
```javascript
fetch(
  '/message/4', 
  { 
    method: 'PUT', 
    headers: { 'Content-Type': 'application/json' }, 
    body: JSON.stringify({ text: 'Fourth message', id: 10 })
  }
).then(result => result.json().then(console.log));
```

- DELETE existing
```javascript
fetch('/message/4', { method: 'DELETE' }).then(result => console.log(result))
```