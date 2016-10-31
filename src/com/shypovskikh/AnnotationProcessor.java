package com.shypovskikh;

/**
 * Created by Mercurius on 30.10.2016.
 */
public class AnnotationProcessor {
    public static void main(String[] args) {
        inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);
    }

    static void  inspectService(Class<?> service){
           if(service.isAnnotationPresent(Service.class)){
            Service ann = service.getAnnotation(Service.class);
               System.out.println("class"+service.getName()+" has annotation:");
               System.out.println( " name = "+ann.name());
               System.out.println(" lazyLoad = "+ann.lazyLoad());
        }
        else System.out.println("Class "+service.getName()+" doesn't contains annotation Service");
    }

}
