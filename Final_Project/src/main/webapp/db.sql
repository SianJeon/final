select to_char(writedate + 9/24, 'hh24') as hour, count (to_char(writedate + 9/24,'hh24'))
from message
group by to_char(writedate + 9/24,'hh24') order by hour;


