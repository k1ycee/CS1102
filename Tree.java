package turing;

/***
 * @author ThankGod Chiagozie
 */

public class Tree {
    Node root;

    public boolean insert(int val){
        if(root == null){
            root = new Node(val);
            return  true;
        }else{
            return root.insert(val);
        }
    }


    public boolean find(int val){
        if(root == null){
            return false;
        } else {
            return root.find(val);
        }
    }

    public void preOrder(){
        if(root != null){
            System.out.println("Pre-Order: ");
            root.preOrder();
        }
    }
    public void postOrder(){
        if(root != null){
            System.out.println("Post-Order: ");
            root.postOrder();
        }
    }
    public void inOrder(){
        if(root != null){
            System.out.println("InOrder: ");
            root.inOrder();
        }
    }



    private class Node{
        private  Node leftChild;
        private Node rightChild;
        private int data;


        private Node(int val){
            data = val;
        }


        private void preOrder(){
            if(this != null){
                System.out.println(this.data);
                if(this.leftChild != null){
                    this.leftChild.preOrder();
                } else if (this.rightChild != null) {
                    this.rightChild.preOrder();
                }
            }
        }

        private void postOrder(){
            if(this != null){

                if(this.leftChild != null){
                    this.leftChild.postOrder();
                } else if (this.rightChild != null) {
                    this.rightChild.postOrder();
                }
                System.out.println(this.data);
            }
        }

        private void inOrder(){
            if(this != null){
                System.out.println(this.data);
                if(this.leftChild != null){
                    this.leftChild.inOrder();
                    System.out.println(this.data);
                } else if (this.rightChild != null) {
                    this.rightChild.inOrder();
                }
            }
        }


        private boolean find(int val){
            boolean found =false;
            if(this == null){
                return false;
            } else{
                if(val == this.data){
                    return true;
                }else if(val <this.data && this.leftChild!=null){
                    found = this.leftChild.find(val);
                } else if (val < this.data && this.rightChild != null) {
                    found = this.rightChild.find(val);
                }
            }
            return found;
        }

        private boolean insert(int val){
            boolean added = false;
            if (this == null){
                this.data = val;
                return true;
            } else{
                if (val < this.data){
                    if(this.leftChild == null){
                        this.leftChild = new Node(val);
                        return true;
                    }else{
                        added = this.leftChild.insert(val);
                    }
                }
                else if(val > this.data){
                    if(this.rightChild == null){
                        this.rightChild = new Node(val);
                        return true;
                    }else{
                        added = this.rightChild.insert(val);
                    }
                }
            }
            return added;
        }
    }


}
