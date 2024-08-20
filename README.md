# Ung-DSA-Repo
## algoritm
![](img/Abstract.png)
## data structure 

## problem and solve

Every Day!!

> [!NOTE]
> note......

```java

static List<Integer> getPossibleStates(int noOfBonesInHeap) {
    return IntStream.rangeClosed(1, 3).boxed()
            .map(i -> noOfBonesInHeap - i)
            .filter(newHeapCount -> newHeapCount >= 0)
            .collect(Collectors.toList());
}

```