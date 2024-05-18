# ParallelFor
A parallel version of classic for loop in Java inspired from C# .NET `Parallel.For();`

## How to use
The classic for-loop in Java : 
```java
for (int i = 0; i < 1000; i++) 
{
     // write your code here
     System.out.println(i);
}
```

The Parallel for-loop : 
```java
Parallel.For(0, 1000, 1, new IRun() {
     @Override
     public void run(int i)
     {
          // write your code here
          System.out.println(i);
     }
});
```
