select to_char(writedate + 9/24, 'hh24') as hour, count (to_char(writedate + 9/24,'hh24'))
from message
group by to_char(writedate + 9/24,'hh24') order by hour;

select to_char(writedate + 9/24, 'HH24') as hour,
             count(to_char(writedate + 9/24, 'HH24')) as cnt
        from message
        group by to_char(writedate + 9/24, 'HH24')
        order by 1;
ddd?
