public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Binary pohon =new Binary();

        pohon.NewNode(20);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);


        System.out.println("\n Pre Order : ");
        pohon.preOrder(pohon.root);
        System.out.println("\n In Order : ");
        pohon.inOrder(pohon.root);
        System.out.println("\n Post Order : ");
        pohon.postOrder(pohon.root);


    }

}