/**
 * Project name(项目名称)：不规则数组
 * Package(包名): PACKAGE_NAME
 * Description(描述)： 无
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/24
 * Time(创建时间)： 16:59
 * Version(版本): 1.0
 */

public class test
{
    public static void main(String[] args)
    {
        int[][] array = new int[4][];
        array[0] = new int[3];
        array[1] = new int[1];
        array[2] = new int[2];
        array[3] = new int[4];
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = i + j;
            }
        }
        for (int[] row : array)
        {
            for (int i : row)
            {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }
    }
}
