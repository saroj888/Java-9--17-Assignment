package assign_5;

class Resource implements AutoCloseable{
    public Resource() {
        System.out.println("Created");
    }
    public void display()
    {
        System.out.println("Resource");
    }
    public  void close()
    {
        System.out.println("Cleanup");
    }
}

class Resource2 implements AutoCloseable{
    public Resource2() {
        System.out.println("Created2");
    }
    public void display()
    {
        System.out.println("Resource2");
    }
    public  void close()
    {
        System.out.println("Cleanup2");
    }
}

public class question8 {
    public static void main(String[] args) {
        Resource resource= new Resource();
        Resource2 resource2= new Resource2();
        try(resource;resource2)
        {
            resource.display();
            resource2.display();
        }

    }
}