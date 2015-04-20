# GraphQL

Create a grammar which is:
- Easy to read
- Familiar with SQL
- Expressive in working with Graph and Document data.
- Based on the concept of Multi Model DBMS with Document & Graph.

##Example

```SQL
select from ( traverse out("walk_with") from Animal where name = "Lisa" ) where name = "Dog" order by age asc limit 10
```

![simple-select](https://raw.githubusercontent.com/StarpTech/GraphQL/develop/img/simple-select.png)

##Todo
- [ ] Implement the fundamental rules in antlr.
- [ ] Setup whole Project in IntelliJ
- [ ] Implement Parse-Tree Listeners

##Inspiration
Thanks to [OrientDb](http://orientdb.com) the first Multi Model DBMS with Document & Graph engine 

##Contributing
1. Get Started ANTLR: [Getting Started with ANTLR v4](https://theantlrguy.atlassian.net/wiki/display/ANTLR4/Getting+Started+with+ANTLR+v4)
2. Fork & Pull request ;)

## License

[MIT](http://opensource.org/licenses/MIT)

Copyright (c) 2015 - Dustin Deus
