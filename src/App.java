public class App {
    public static void main(String[] args) throws Exception {
        linearList l = new linearList();

        l.initializeList();
        l.size(10);
        l.setValues(1);
        
        System.out.println("Current state of the list:");
        l.printList();
        System.out.println();
        
        System.out.println();
    }
}
