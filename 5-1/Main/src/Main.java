import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		{
//      問① 下記例の配列をString型しか格納できないように修正してください。
//		現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
			List<String> array = new ArrayList<String>();
			array.add("hoge");
			array.add("pos");
			array.add("foo");
//		また、arrayには[hoge, pos, foo]の文字列３要素を入れてください。
//	    <以下記述>
			
//      問② arrayの二つ目の要素を"bar"にしましょう。
			array.set(1, "bar");
//	　<以下記述>
//      問③ fooが格納されているインデックスを出力してください。
			 int firstBlueIndex = array.indexOf("foo");
			 System.out.println(firstBlueIndex);

//	　<以下記述>
		}

		{
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("a", "アルファ");
		map.put("b", "ブラボー");
		map.put("c", "チャーリー");
		
//	　<以下記述>

//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
//	    <以下記述>
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey());
          
        }

//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
//	    <以下記述>
        for (Map.Entry<String, Object> entry : map.entrySet()) {
        
            System.out.println(entry.getValue());
        }
		}
		{
//      問⑦ Calender型calを使い、int型配列arrayDateに今の年・月・日を入れてください。
           Calendar cal = Calendar.getInstance();
           int[] arrayDate=new int[3];
           arrayDate[0] = cal.get(Calendar.YEAR);
           arrayDate[1]=(cal.get(Calendar.MONTH)+1);
           arrayDate[2]=cal.get(Calendar.DATE);
//	    <以下記述>
//      問⑧ 配列arrayDateをList型に置換しましょう。
//      ヒント：asListメソッドはプリミティブ型のデータ型のみ扱えます。
           List<Integer> sampleList = new ArrayList<Integer>();
           for(int i=0;i<3;i++) {
           sampleList.add(arrayDate[i]);
           }
//	    <以下記述>
//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//	    <以下記述>
           for (int  i= 0; i < sampleList.size(); i++) {
               System.out.println(sampleList.get(i));
		}
	}

}
}
