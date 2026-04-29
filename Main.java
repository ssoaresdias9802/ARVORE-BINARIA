public class Main{
    public static void main(String [] args) throws Exception{
         BinaryTree formula = new BinaryTree();
        Node n1 = new Node('+');
        formula.addRoot(n1);
        Node n2 = new Node('*');
        formula.addLeft(n2, n1);
        Node n4 = new Node('a');
        formula.addLeft(n4, n2);
        Node n5 = new Node('b');
        formula.addRight(n5, n2);
        Node n3 = new Node('/');
        formula.addRight(n3, n1);
        Node n6 = new Node('-');
        formula.addLeft(n6, n3);
        Node n8 = new Node('x');
        formula.addLeft(n8, n6);
        Node n9 = new Node('y');
        formula.addRight(n9, n6);
        Node n7 = new Node('+');
        formula.addRight(n7, n3);
        Node n10 = new Node('c');
        formula.addLeft(n10, n7);
        Node n11 = new Node('e');
        formula.addRight(n11, n7);

        System.out.print("In-Ordem: ");
        //exbir em ordem
        formula.visitInOrdem(n1);
        System.out.println("\nPos-Ordem: ");
        //exibir em pos ordem
        formula.visitPosOrdem(n1);
        System.out.println("\nPré-Ordem: ");
        // exibir em pre-ordem
        formula.visitPreOrdem(n1);
    }
}