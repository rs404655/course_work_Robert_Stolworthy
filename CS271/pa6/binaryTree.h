#ifndef BINARYTREE_H
#define BINARYTREE_H

struct treeNode{
    struct treeNode *leftPtr;
    int data;
    struct treeNode *rightPtr;
};

typedef struct treeNode TreeNode;
typedef TreeNode *TreeNodePtr;

int min ( TreeNodePtr treePtr );

int max ( TreeNodePtr treePtr );

int sum ( TreeNodePtr treePtr );

void insertNode( TreeNodePtr *treePtr, int value );

#endif
