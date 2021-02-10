#include <iostream>

using namespace std;

struct TreeNode{
    int value;
    TreeNode(int v):value(v){
        leftChild=NULL;
        rightChild=NULL;
    }
    TreeNode* leftChild;
    TreeNode* rightChild;
    TreeNode():value(0){}
};

void PreOrder(TreeNode* root){
    if(root!=NULL){
        cout<<(char)root->value;
        PreOrder(root->leftChild);
        PreOrder(root->rightChild);
    }
}

int main(){
    printf("German:");
    TreeNode n1(114);
    TreeNode n2(104);
    TreeNode n3(97);
    TreeNode n4(74);
    TreeNode n5(32);
    TreeNode n6(115);
    TreeNode n7(101);
    TreeNode n8(117);
    TreeNode n9(101);
    TreeNode n10(110);
    TreeNode n11(32);
    TreeNode n12(115);
    TreeNode n13(101);
    TreeNode n14(104);
    TreeNode n15(111);
    TreeNode n16(114);
    TreeNode n17(70);
    n15.rightChild=&n11;
    n10.leftChild=&n9;
    n17.rightChild=&n7;
    n7.leftChild=&n6;
    n14.rightChild=&n12;
    n7.rightChild=&n3;
    n17.leftChild=&n16;
    n16.rightChild=&n10;
    n16.leftChild=&n15;
    n15.leftChild=&n14;
    n10.rightChild=&n8;
    n14.leftChild=&n13;
    n6.leftChild=&n5;
    n6.rightChild=&n4;
    n3.leftChild=&n2;
    n3.rightChild=&n1;
    PreOrder(&n17);
    cout<<endl;
    return 0;
}