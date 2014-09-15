git filter-branch --env-filter \
    'if [ $GIT_COMMIT = 02487865102b88e966654a1305fad15993afe9e7 ]
     then
         export GIT_AUTHOR_DATE="Fri Jan 2 21:38:53 2015 -0800"
         export GIT_COMMITTER_DATE="Sat May 19 01:01:01 2015 -0700"
     fi'
