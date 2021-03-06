package com.xl.example.sts.redis;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisConnectionTest {

//    @Autowired
//    private RedisTemplate<String,String> redisTemplate;
//
//
//    
//    @Test
//    public void string(){
//        redisTemplate.opsForValue().set("name","echo");
//        System.out.println(redisTemplate.opsForValue().get("name"));
//    }
    
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    
    @Test
    public void object(){
    	redisTemplate.opsForValue().set("name","echo");
        System.out.println(redisTemplate.opsForValue().get("name"));
    }

}