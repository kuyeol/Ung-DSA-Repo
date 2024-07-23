# Approach

## [1] Divide & Conquer

---

> [!NOTE]
> Array To Divide
>

```mermaid
block-beta
    columns 1
    block: ID
        columns 1
        4,2,5,1,3,7:1
    end

    space

    block: ID1
        columns 3
        4,2,5:2 1,3,7:2
    end

    space

    block: ID2
        columns 8
        4,2:2 5:1 1,3:2 7:1
    end

    block: ID3
        columns 8
        .4:1 .2:1 .5:2 .1:1 .3:1 .7:2
    end

    ID --> 4,2,5
    ID --> 1,3,7
    4,2,5 --> 4,2
    4,2,5 --> 5
    1,3,7  --> 1,3
    1,3,7  --> 7
    4,2 --> .4
    4,2 --> .2
    5 --> .5
    1,3 --> .1
    1,3 --> .3
    7 --> .7


```

> [!NOTE]
> Conquer
> - Merge And Sort

```mermaid
block-beta
    columns 1
    block: ID
        columns 8
        .4:1 .2:1 .5:2 .1:1 .3:1 .7:2
    end

    block: ID2
        columns auto
        2,4:2 5:1 1,3:2 7:1
    end
    block: ID3
        columns auto
        2,4,5:2 space:1 1,3,7:2
    end

    block: ID4
        columns auto
        1,2,3,4,5,7:2
    end

    .4-->2,4
    .2 -->2,4
    .5 --> 5
    .1 -->  1,3
    .3 -->  1,3
    .7 --> 7
    2,4-->2,4,5
    5 --> 2,4,5
    1,3 --> 1,3,7
    7 --> 1,3,7
    2,4,5 --> 1,2,3,4,5,7
    1,3,7 --> 1,2,3,4,5,7





```

---

![img.png](img.png)

# Divide and Conquer algorithm?

 ### The main steps are:
> [!NOTE]
> ```
> - Algorithm : Merge Sort
> - Input : int[]
> - Output: int[] 
> ``` 
>
> 1. Divide: 
> > Break the problem into smaller subproblems.
> 2. Conquer: 
> > Solve the subproblems recursively.
> 3. Combine: 
> > Merge or combine the solutions of the subproblems to obtain the solution to the original problem.

<details>
<summary>toKorean</summary>

```
문제 나누기 : 문제를 더 작은 하위 문제로 나눕니다.
정복 (Conquer) : 하위 문제를 재귀적으로 해결합니다.
결합 : 하위 문제의 솔루션을 병합하거나 결합하여 원래 문제에 대한 솔루션을 얻습니다. 
```

</details>

---

## [1] Divide & Conquer

## [1] Divide & Conquer

