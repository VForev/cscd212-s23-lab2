package cscd212comparators.lab2;

import cscd212classes.lab2.Television;

import java.util.Comparator;

public class TelevisionResolutionMakeDescendingComparator extends Object implements Comparator<Television> {


    @Override
    public int compare(final Television t1, final Television t2) throws IllegalArgumentException {

        if (t1 == null || t2 == null)
            throw new IllegalArgumentException("null parameter in TelevisionResolutionMakeDescendingComparator");

        if (t1.getResolution()-t2.getResolution() == 0)
            return t2.getMake().compareTo(t1.getMake());
        else
            return t2.getResolution()-t1.getResolution();

    }

}
