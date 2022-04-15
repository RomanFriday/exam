import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void emptyTest() {
        int arr[]={};
        int n=0;
        Main.selSort(arr,n);
    }

    @Test
    public void oneElemTest(){
        int arr[]={1};
        int n=1;
        Main.selSort(arr,n);
        assertEquals(1,arr[0]);
    }

    @Test
    public void twoElemTest(){
        int arr[]={0,-1};
        int n=2;
        Main.selSort(arr,n);
        int exp[]={-1,0};
        assertArrayEquals(exp,arr);
    }

    @Test
    public void equalsElemTest(){
        int arr[]={-3,-3,-3};
        int n=3;
        Main.selSort(arr,n);
        int exp[]={-3,-3,-3};
        assertArrayEquals(exp,arr);
    }

    @Test
    public void differentElemsTest(){
        int arr[]={3,-1,0,5,0,3,-2};
        int n=7;
        Main.selSort(arr,n);
        int exp[]={-2,-1,0,0,3,3,5};
        assertArrayEquals(exp,arr);
    }

}