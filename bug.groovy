```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    println "Item at index $index: $item"
    if (item == "stop") {
      return  // This will only exit the eachWithIndex loop
    }
  }
  println "This line will always execute after eachWithIndex"
}

myMethod(['a', 'b', 'stop', 'c'])
```