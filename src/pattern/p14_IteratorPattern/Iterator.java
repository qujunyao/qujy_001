package pattern.p14_IteratorPattern;

/**
 * ���������
 * 
 * @author Administrator
 *
 */
public interface Iterator {

	// ��������һ��Ԫ��
	public Object next();

	// �Ƿ��Ѿ�������β��
	public boolean hasNext();

	// ɾ����ǰָ���Ԫ��
	public boolean remove();

}