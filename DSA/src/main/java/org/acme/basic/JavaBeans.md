# Advantages Of Java Beans

### - Write-once , Run-anywhere
> [ `properies` , `events` , `methods` ]

## Java Beans Design Pattern    
### 1. Simple Properties
- ...
> ```java
> public T getN();
> public void setN( T args );
>```
****

### 2. Indexed Properties
- called data
> ```java
> public T getN(int index);
> public void setValue(int index,T value);
> public T[] getN();
> public void setN(T[] values);
>
>```
****

### 3. Events
- Beans Use the Delegation Event Model
> ```java
> public void add_T_Listner(T_Listner eventListener);
> public void add_T_Listner(T_Listner eventListener) throws Exception;
> public void remove_T_Listner(T_Listner eventListener);
>```
>
****  
