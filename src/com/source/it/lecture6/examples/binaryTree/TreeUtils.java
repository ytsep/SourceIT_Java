package com.source.it.lecture6.examples.binaryTree;

public class TreeUtils {
    private static final int LENGTH_FOR_NODE = 20;
    private  static final int LENGTH_STRING = 50;

    public static int getDepth(BinaryTree tree) {
        int leftDepth = 0;
        int rightDepth = 0;
        if (tree.getLeft() != null) {
            leftDepth = getDepth(tree.getLeft());
        }
        if (tree.getRight() != null) {
            rightDepth = getDepth(tree.getRight());
        }
        return 1 + Math.max(leftDepth, rightDepth);
    }

    public static void putTable (BinaryTree tree, int level, int[][] table, int position) {

        table[level][position] = tree.getValue();

        if (tree.getLeft() != null) {
            position *= 2;
            putTable(tree.getLeft(), ++level, table, position);
        }

        position++;

        if (tree.getRight() != null) {
            putTable(tree.getRight(), level, table, position);
        }

    }

    public  static void drawTree(BinaryTree tree) {
        int depth  = TreeUtils.getDepth(tree);
        int[][] dataTree = new int[depth][depth * 2];

        putTable(tree, 0, dataTree, 0);

        /*int tempLengthString = 50 / count;
        System.out.printf("%" + tempLengthString + "s", tree.getValue());
        System.out.println();
        System.out.printf("%" + (tempLengthString + 1) + "s", "/ \\");
        System.out.println();*/

        for (int i = 0; i < depth; i++) {
            int count = (int)Math.pow(2, i);
            int l = LENGTH_STRING / count;
            for (int j = 0; j < count; j++) {
                if (dataTree[i][j] != 0) {
                    System.out.printf("%" + l / 2 + "s", dataTree[i][j]);
                    System.out.printf("%" + (l / 2) + "s", " ");

                } else {
                    System.out.printf("%" + l + "s", " ");
                }

            }
            System.out.println();
            System.out.print(" ");
            for (int j = 0; j < count; j++) {
                if (dataTree[i][j] != 0) {

                    System.out.printf("%" + (l / 2) + "s", "/ \\");
                    System.out.printf("%" + (l / 2) + "s", " ");
                } else {
                    System.out.printf("%" + l + "s", " ");
                }

            }
            System.out.println();
        }
    }
}
