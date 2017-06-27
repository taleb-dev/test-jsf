# JSF PrimeFaces Examples

Run as:

```bash
mvn clean jetty:run
```

And hit:
[http://localhost:8080/index.xhtml](http://localhost:8080/index.xhtml)


# Primefaces

Primefaces comes with a lot of [widgets](https://www.primefaces.org/showcase/index.xhtml) and
[extensions](https://www.primefaces.org/showcase-ext/views/home.jsf).
It also has a [very comprehensive guide](https://www.primefaces.org/docs/guide/primefaces_user_guide_6_1.pdf)


`h:head` element is necessary in JSF because it loads all the required JS libraries.  
`h:form` element is also necessary otherwise `autoComplete` or `p:ajax` constructs will not work.  
Also make sure to go through the common gotchas on [this stackoverflow link](https://stackoverflow.com/questions/2118656/commandbutton-commandlink-ajax-action-listener-method-not-invoked-or-input-value)
