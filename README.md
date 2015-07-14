# customJSFLiberty
Project that shows how to use custom JSF implementation with IBM Liberty Profile. 

It's very important to notice that using a custom JSF will not work with CDI. If you need to use CDI than it's required that you use the default Liberty JSF implementation.

To demonstrate this implementation I will create a very simple web application called CustomJSFLiberty that will implement a Dummy calculator that has sum and subtraction operations.

The following frameworks / libraries will be used in this example: 

1) Prime Faces 5.1 
2) JSF 2.2.x (latest available at this moment) Mojarra implementation

I will demonstrate 2 different ways of running this application with custom JSF Mojarra 2.2.x, first packaging the mojarra libraries inside the WEB-INF/lib folder of the application and than how to use it as a shared library. I will also demonstrate that using different class loader approaches in liberty(parent first or parent last) will not affect the final result and both approaches work with Liberty. I will demonstrate how to use it with parent last with parent last class loader because if you're also deploying this application to WAS N.D 8.5.5.5 that by default is shipped with MyFaces 2.0 libraries support you'll have to use this approach to use JSF Mojarra 2.2.x instead of provided MyFaces. In many cases this is the current scenario that I've seen around as developers prefer to use Liberty and many times the production environment uses WAS N.D full profile in official development, test, Q.A and production environments so in order to make the application as similar as possible in dev and other environments this approach is recommended(parent last with shared library), avoiding surprises when deploying the application to WAS N.D.

Plese see a detailed step by step of creating this application at my blog at: 
