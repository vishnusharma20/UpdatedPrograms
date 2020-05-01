import com.sun.tools.javac.util.ArrayUtils;
import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLInput;
import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinSwapArray {


    public static void main(String[] args) {


        int[] arr={2, 3, 4, 1, 5};
            int count = 0;
            int i = 0;
            while (i < arr.length) {
                if (arr[i] != i + 1) {
                    while (arr[i] != i + 1) {
                        int temp = 0;
                        temp = arr[arr[i] - 1];
                        arr[arr[i] - 1] = arr[i];
                        arr[i] = temp;
                        count++;
                    }
                }
                i++;
            }
            System.out.println(count);
        }


}
