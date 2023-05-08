package lab1;
import java.util.*;

public class SizeableVehicleStorage<K, V> extends HashMap<K, V>
{
	int maxKey;
	public SizeableVehicleStorage(int in_maxKey)
	{
		maxKey = in_maxKey;
	}
	
	//all functions we chose to override check for the max key when writing to memory,
	//in order to make sure we're not exceeding the max key
	
	
	public V put(K key, V value) throws StorageError
	{
		if(super.size() > maxKey)
			throw new StorageError("Key is invalid");
		return super.put(key, value);
	}
	
	public void putAll(SizeableVehicleStorage<K, V> svt) throws StorageError
	{
		if(this.maxKey < svt.maxKey)
			throw new StorageError("Target map is too small");
		super.putAll(svt);
		return;
	}
	
	public V putIfAbsent(K key, V v) throws StorageError
	{
		if(super.size() > maxKey)
			throw new StorageError("Key is invalid");
		return super.putIfAbsent(key, v);
	}
}
