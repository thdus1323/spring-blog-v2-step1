package shop.mtcoding.blog.util;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.sql.Timestamp;

public class DateTest {
   @Test
       public void timestampFormat_test() {

       // given
       Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());

       // when
       String createdAt = MyDateUtil.timestampFort(currentTimestamp);

       // then
       System.out.println("timestampFormat_test : " + createdAt);
   }

   @Test
    public void format_test(){

       // given
       Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
       Date currentDate = new Date(currentTimestamp.getTime());

       String formatterDate = DateFormatUtils.format(currentDate, "yyyy-MM-dd HH:mm");

       System.out.println("format_test : " + formatterDate);
   }
}
