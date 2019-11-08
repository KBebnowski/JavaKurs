package Collections5_Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CopySet_Intersection_Diffrent {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(6);

        set2.add(1);
        set2.add(3);
        set2.add(5);

        /////////////COPY//////////////
        Set<Integer> interSection = new HashSet<Integer>(set1);//skopiowanie elementow z set1 do interSection, interSection jest kopia set1
        System.out.println(interSection);

        ///////////INTERSECTION////////////
        interSection.retainAll(set2);//zachowuje tylko te elementy, ktore sa takie same w set 2 i w interSection, ktory jest kopia set1
        System.out.println(interSection);

        //////////DIFFRENCE//////////////
        Set<Integer> Diffrent = new HashSet<>(set1);
        Diffrent.removeAll(set2);//usuwa elementy, z Diffrent, ktore sa takie same w set2
        System.out.println(Diffrent);


    }
}
