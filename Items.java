import java.util.Arrays;

/**
 * Created on : 27/03/2022
 * Author     : Yoann Meclot (DevMyBits)
 * Email      : yoannmeclot@hotmail.com
 */
public final class Items
{
    private static final int MAX_SIZE = Integer.MAX_VALUE - 8;
    private static final int DEFAULT_CAPACITY = 10;

    public static long[] ensureCapacity(long[] items, int minCapacity)
    {
        if (items.length == 0) minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        if (minCapacity - items.length > 0)
        {
            int oldCapacity = items.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);

            if (newCapacity - minCapacity < 0) newCapacity = minCapacity;
            if (newCapacity - MAX_SIZE > 0) newCapacity = maxCapacity(minCapacity);

            long[] newItems = new long[newCapacity];
            System.arraycopy(items, 0, newItems, 0, Math.min(items.length, newCapacity));

            return newItems;
        }
        return items;
    }

    public static byte[] ensureCapacity(byte[] items, int minCapacity)
    {
        if (items.length == 0) minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        if (minCapacity - items.length > 0)
        {
            int oldCapacity = items.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);

            if (newCapacity - minCapacity < 0) newCapacity = minCapacity;
            if (newCapacity - MAX_SIZE > 0) newCapacity = maxCapacity(minCapacity);

            byte[] newItems = new byte[newCapacity];
            System.arraycopy(items, 0, newItems, 0, Math.min(items.length, newCapacity));

            return newItems;
        }
        return items;
    }

    public static int[] ensureCapacity(int[] items, int minCapacity)
    {
        if (items.length == 0) minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        if (minCapacity - items.length > 0)
        {
            int oldCapacity = items.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);

            if (newCapacity - minCapacity < 0) newCapacity = minCapacity;
            if (newCapacity - MAX_SIZE > 0) newCapacity = maxCapacity(minCapacity);

            int[] newItems = new int[newCapacity];
            System.arraycopy(items, 0, newItems, 0, Math.min(items.length, newCapacity));

            return newItems;
        }
        return items;
    }

    public static boolean[] ensureCapacity(boolean[] items, int minCapacity)
    {
        if (items.length == 0) minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        if (minCapacity - items.length > 0)
        {
            int oldCapacity = items.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);

            if (newCapacity - minCapacity < 0) newCapacity = minCapacity;
            if (newCapacity - MAX_SIZE > 0) newCapacity = maxCapacity(minCapacity);

            boolean[] newItems = new boolean[newCapacity];
            System.arraycopy(items, 0, newItems, 0, Math.min(items.length, newCapacity));

            return newItems;
        }
        return items;
    }

    public static <T> T[] ensureCapacity(T[] items, int minCapacity)
    {
        if (items.length == 0) minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        if (minCapacity - items.length > 0)
        {
            int oldCapacity = items.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);

            if (newCapacity - minCapacity < 0) newCapacity = minCapacity;
            if (newCapacity - MAX_SIZE > 0) newCapacity = maxCapacity(minCapacity);

            //noinspection unchecked
            return (T[]) Arrays.copyOf(items, newCapacity, items.getClass());
        }
        return items;
    }

    private static int maxCapacity(int minCapacity)
    {
        if (minCapacity < 0) throw new OutOfMemoryError();
        return (minCapacity > MAX_SIZE) ? Integer.MAX_VALUE : MAX_SIZE;
    }
}