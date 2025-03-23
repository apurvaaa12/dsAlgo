import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class March {
    public static void main(String[] args){

        List<String> names = new ArrayList<>();
        names.add("Apurva");
        names.add("Apurva");
        names.add("Apurva");
        names.add("Apurva");
        names.add("Apurva");
        names.add("Akshith");
        names.add("Akshith");
        names.add("Akshith");
        names.add("Akshith");
        names.add("Prasanth");
        names.add("Prasanth");
        names.add("Prasanth");
        names.add("Jello");
        names.add("wallo");
        names.add("jaggu");
//        names.add(null);

        names.stream().filter( n-> n.startsWith("P"))
                .forEach(System.out::println);
        names.forEach(System.out::println);


//        List<String> topFiveRepeated = topStrings(names);
//        System.out.println(topFiveRepeated);
    }

//    public static List<String> topStrings(List<String> names){
////        HashMap<String,Integer> map = new HashMap<>();
//        List<String> output = new ArrayList<>();
////        for(int i=0;i<names.size();i++){
////            String current = names.get(i);
////            if(map.containsKey(current)){
////                map.put(current,map.getOrDefault(current,0)+1);
////            }else{
////                map.put(current,1);
////            }
////        }
////        System.out.println(map);
//
//      names.stream().forEach(System.out::println);
//
//     return output;
//    }
}


//employee and employeereimb

//emp_id, emp_name, emp_dept
//emp_re_id,emp_rem_amt

// select * from employee as emp left join employeereimb as reimb
// on emp.emp_id = reimb.emp_re_id
// reimb.emp_rem_amt = null
//group by emp.dept

