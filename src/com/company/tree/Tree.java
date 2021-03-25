package com.company.tree;


    class Node{
        Node left, right;
        int data;
        public Node(int data){
            this.data=data;
        }
        public void insert(int value){
            if (value<=data){
                if(left==null){
                    left=new Node(value);
                } else{
                    left.insert(value);
                }
            }
            else{
                if(right==null){
                    right= new Node(value);
                }else{
                  right.insert(value);
                }
            }
        }
        public Boolean contains(int value){
            if(value==data){
                return true;
             } else if (value < data) {
                    if(left==null){
                        return false;
                    }else{
                        return left.contains(value);
                    }
            }else{
                if(right==null){
                    return false;
                }else{
                    return  right.contains(value);
                }
            }

        }
        // traversal
        public void inorder(){

        }
    }



    public class Tree {
    public static void main(String[] args) {

    }
}
