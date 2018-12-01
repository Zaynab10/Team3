
package Taster;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tester {
   public static void main(String[] args) {
      List<Integer> objArray = new ArrayList<Integer>();
      objArray.clear();
      objArray.add(4);
      objArray.add(-1);
      objArray.add(0);
      objArray.add(8);
      objArray.add(-8);
      objArray.add(9);
      System.out.println("Array before removing an element "+objArray);
      Iterator<Integer> iterator = objArray.iterator();

         while(iterator.hasNext()) {
         Integer next = iterator.next();
         if(next < 0) {
            iterator.remove();

         }
      }
      System.out.println("Array after removing an element"+objArray);
   }
}
