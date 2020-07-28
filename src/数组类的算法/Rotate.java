package 数组类的算法;
/*
 *@author tanguochao
 *@description
 *@date
 */

import java.util.Arrays;

public class Rotate {
    /*   给定一个 n × n 的二维矩阵表示一个图像。
       将图像顺时针旋转 90 度。
       说明：
       你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
       示例 1:
       给定 matrix = [
           [1,2,3],
           [4,5,6],
           [7,8,9]],
       原地旋转输入矩阵，使其变为:
               [
               [7,4,1],
               [8,5,2],
               [9,6,3]
               ]
   */
    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        int[][] newMatrix = rotate(matrix);
        for (int i = 0; i < newMatrix.length; i++) {
            System.out.println(Arrays.toString(newMatrix[i]));
        }
    }

    public static int[][] rotate(int[][] matrix) {

        /*左上角的点，绝对向右移动，
        右上角的点，绝对向下移动，
        右下角的点，绝对向左移动，
        左下角的点，绝对向上移动，
        归纳得到有两个固定不变的值，其对应在第一次旋转中，分别是0和matrix.length。
        剩余两个变化的值也有规律，分别是两个运动轨迹:从0->matrix.length和从matrix.length->0
        提取运动轨迹间的关系，就能通过循环，完成第一圈旋转
        开始内圈旋转的时候，变换固定值，约束内圈，返回到开始的思路，继续旋转*/

        int abs1 = 0;
        int abs2 = matrix.length - 1;
//        int times = 0;
        while (abs1 < abs2) {
            int p1 = abs1;
            int p2 = abs2;
            while (p1 != abs2) {
                int temp = matrix[abs1][p1];        //左上
                matrix[abs1][p1] = matrix[p2][abs1];//左上 = 左下
                matrix[p2][abs1] = matrix[abs2][p2];//左下 = 右下
                matrix[abs2][p2] = matrix[p1][abs2];//右下 = 右上
                matrix[p1][abs2] = temp;            //右上 = 左上
                p1 += 1;
                p2 -= 1;
            }
            abs1 += 1;
            abs2 -= 1;
        }
        return matrix;
    }
}
