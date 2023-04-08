import java.util.Arrays;
// import java.util.Random;

public class app {
  public static void main(String[] args) { 
    printNode(treeBuild(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11 }), "");
  }

  static void printNode(Node node, String sp) {
    if (node != null) {
      System.out.println(sp + node.value);
      printNode(node.right, sp + "  ");
      printNode(node.left, sp + "  ");
    }
  }

  // static Node treeBuild(int n) {
  //   Node node = null;
  //   if (n == 0)
  //     return node;
  //   else {
  //     node = new Node(new Random().nextInt(100));
  //     node.left = treeBuild(n / 2);
  //     node.right = treeBuild(n - n / 2 - 1);
  //   }
  //   return node;
  // }

  static Node treeBuild(int[] arr) { 
    Node node = null;
    int n = arr.length; 
    if (n == 0)
      return node;
    else {
      node = new Node(arr[0]);
      node.left = treeBuild(Arrays.copyOfRange(arr, 1, n/2 + 1));
      node.right = treeBuild(Arrays.copyOfRange(arr, n/2 + 1, n));
    }
    return node;
  }
}

class Node {
  int value;

  public Node(int value) {
    this.value = value;
  }

  Node left;
  Node right;
  Node parent;
  int color;
}

