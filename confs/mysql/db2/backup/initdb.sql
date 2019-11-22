use mysql;
create user 'replicator'@'%' identified by 'password';
grant replication slave on *.* to 'replicator'@'%';
# do note that the replicator permission cannot be granted on single database.
FLUSH PRIVILEGES;
SHOW MASTER STATUS;
SHOW VARIABLES LIKE 'server_id';