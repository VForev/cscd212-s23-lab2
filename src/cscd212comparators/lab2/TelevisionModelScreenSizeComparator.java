package cscd212comparators.lab2;
import cscd212classes.lab2.Television;
import java.util.Comparator;

public class TelevisionModelScreenSizeComparator extends Object implements Comparator<Television> {

    @Override
    public int compare(final Television t1, final Television t2) throws IllegalArgumentException {

        if (t1 == null || t2 == null)
            throw new IllegalArgumentException("null parameter in TelevisionModelScreenSizeComparator");

        if (t1.getModel() == t2.getModel())
            return t1.getScreenSize() - t2.getScreenSize();
        else
            return t1.getModel().compareTo(t2.getModel());

    }

}
