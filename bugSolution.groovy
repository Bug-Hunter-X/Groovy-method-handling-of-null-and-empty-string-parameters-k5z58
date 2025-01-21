```groovy
def myMethod(String param) {
  if (param == null || param.isEmpty()) {
    println "Parameter is null or empty"
    return
  }
  // ... rest of the method
  println "Parameter is: "+ param
}

myMethod(null)
myMethod("")
myMethod("Hello")
```