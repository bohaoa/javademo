package cd.java.design.flyweight.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cd.java.design.flyweight.more.ConcreteCompositeFlyweight;

public class FlyweightFactory {
	
	private Map<Character,Flyweight> files = new HashMap<Character,Flyweight>();
    
    public Flyweight factory(Character state){
        //先从缓存中查找对象
        Flyweight fly = files.get(state);
        if(fly == null){
            //如果对象不存在则创建一个新的Flyweight对象
            fly = new ConcreteFlyweight(state);
            //把这个新的Flyweight对象添加到缓存中
            files.put(state, fly);
        }
        return fly;
    }
    
    public Flyweight factory(List<Character> compositeState){
        ConcreteCompositeFlyweight compositeFly = new ConcreteCompositeFlyweight();
        
        for(Character state : compositeState){
            compositeFly.add(state,this.factory(state));
        }
        
        return compositeFly;
    }
}
