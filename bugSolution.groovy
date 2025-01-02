```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    println "Item at index $index: $item"
    if (item == "stop") {
      // Correct approach: Use 'break' to exit the loop
      return // this return will exit the closure, which is the same as break
    }
  }
  println "This line will execute only if 'stop' is not encountered"
}

myMethod(['a', 'b', 'stop', 'c'])


def myMethod2(List<String> list) {
  boolean stopped = false
  for (int i = 0; i < list.size(); i++) {
    String item = list[i]
    println "Item at index $i: $item"
    if (item == "stop") {
      stopped = true
      break
    }
  }
  if(!stopped) {
    println "This line will execute only if 'stop' is not encountered"
  }
}

myMethod2(['a', 'b', 'c'])
```