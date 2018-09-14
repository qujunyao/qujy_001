package pattern.p16_ObserverPattern;

/**
 * �۲���ģʽ��������
 * 
 * ���壺
 * �۲���ģʽҲ������������ģʽ������һ������Ŀ�о���ʹ�õ�ģʽ���������£�
 * ��������һ��һ�Զ��������ϵ��ʹ��ÿ��һ������ı�״̬�����������������Ķ��󶼻�õ�֪ͨ���Զ����¡�
 * 
 * ��ɫģ�飺
 * 1��Subject���۲���
 * ���屻�۲��߱���ʵ�ֵ�ְ���������ܹ���̬�����ӣ�ɾ���۲��ߣ���һ���ǳ����������ʵ���࣬���������Ϊ
 * ���۲��߱�ѡʵ�ֵ�ְ�𣺹����۲��߲�֪ͨ�۲��ߡ�
 * 2��Observer�۲���
 * �۲��߽��ܵ���Ϣ�󣬽���update�����£��������Խ��ܵ�����Ϣ���д�����
 * 3��ConcreteSubject����ı��۲���
 * ���屻�۲����Լ���ҵ���߼���ͬʱ�������Щ�¼���֪ͨ��
 * 4��ConcreteObserver����Ĺ۲���
 * ÿ���۲����ڽ��ܵ���Ϣ��Ĵ�����Ӧ�ǲ�ͬ�ģ������۲������Լ��Ĵ����߼���
 * 
 * �ŵ㣺
 * 1���۲��ߺͱ��۲���֮���ǳ������
 * �����ƣ��򲻹������ӹ۲��ߣ����Ǳ��۲��߶��ǳ�������չ��������java�ж��Ѿ�ʵ�ֵĳ���㼶���壬��ϵͳ
 * ��չ���涼����Ӧ�֡�
 * 2������һ�״�������
 * ���ݵ�һְ��ԭ��ÿ�����ְ���ǵ�һ�ģ����磬���˴��ԣ�����һֻĸ¹��ĸ¹���������̣���û��ĸ¹���չ˶�
 * ������ʬ�屻��ֻͺӥ���ᣬ����䲻����ʼ��Ź��Ȼ�����˵�ͺӥ������������������������˵��̣�����γ���һ
 * ���������ƣ��γ���һ�����������۲��� ģʽ����������ʵ�������������ʽ��
 * 
 *  
 * ȱ�㣺
 * ��Ҫ����һ�¿���Ч�ʺ�����Ч�����⣬һ�����۲��ߣ�����۲��ߣ��ڿ����͵��Ե�ʱ��ͱȽϸ��ӣ�������java��
 * ��Ϣ��֪ͨĬ����˳��ִ�еģ�һ���۲��߿��ǻ�Ӱ�������ִ��Ч�ʣ���������£�һ�㿼��ʹ���첽�ķ�ʽ��
 * 
 * 
 * ���ó�����
 * 1��������Ϊ��������Ҫע����ǣ�������Ϊ�ǿɲ�ֵģ���������ϵĹ�ϵ��
 * 2���¼��༶����������
 * 3����ϵͳ����Ϣ��������������Ϣ���еĴ������ơ�
 * 
 * ע�����
 * 1���㲥�������⡣
 * 2���첽�������⡣
 * 
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// ����һ�����۲���
		ConcreteSubject subject = new ConcreteSubject();
		// ����һ���۲���
		Observer observer = new ConcreteObserver();
		// �۲��߹۲챻�۲���
		subject.addObserver(observer);
		// �۲��߿�ʼ�ж���
		subject.doSomething();
	}
}