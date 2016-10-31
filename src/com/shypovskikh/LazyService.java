package com.shypovskikh;

@Service(name = "Super LazyService")
public class LazyService {
    @Init
    public void lazyInit()throws Exception{
        System.out.println("LazyInit Method");
    }
}
