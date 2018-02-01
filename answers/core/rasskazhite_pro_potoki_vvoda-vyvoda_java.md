Потоки ввода-вывода бывают двух видов:
- байтовый поток(<code>InputStream</code>, <code>OutputStream</code>)
- символьный поток (<code>Reader</code>, <code>Writer</code>)

Это все абстрактные классы - декораторы, которым можно добавлять дополнительный функционал, например:

<code>InputStream in = new FileInputStream(new File("file.txt"));</code>