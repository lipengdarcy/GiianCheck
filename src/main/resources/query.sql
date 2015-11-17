select * from dbo.Dept; -- 部门
select * from dbo.Member; -- 人员
select * from dbo.Project; -- 项目
select * from dbo.Project_User; -- 项目review
select * from dbo.Project_review; -- 项目review
select * from dbo.Project_result; -- 项目review

select * from dbo.Project_step; -- 项目review

select c.* from dbo.Dept a, dbo.Member b, dbo.Project c, dbo.Project_User d
where a.ID = b.DeptID and b.OpenID = d.ToUserID 
and c.ID = d.ProjectID and b.Telephone = '18858101357' and b.Password = 'pf5775923';

   




-- sql server
-- 1、获取所有用户名: 
Select name FROM Sysusers where status='2' and islogin='1';

islogin='1' :表示帐户
islogin='0' :表示角色
status='2' :表示用户帐户
status='0' :表示糸统帐户


--2、获取所有数据库名: 
Select Name FROM Master..SysDatabases orDER BY Name ;

--3、获取所有表名: 
Select Name FROM WX_JianAn..SysObjects Where XType='U' order BY Name ;

--XType='U' :表示所有用户表; 
--XType='S' :表示所有系统表; 

 

--4、获取所有字段名: 
Select Name FROM SysColumns Where id=Object_Id('表名') ;

 

--5、获取数据库所有类型: 
select name from systypes;

 

--6、获取主键字段: 

Select name FROM SysColumns Where id=Object_Id('表名') and colid=(select top 1 keyno from sysindexkeys where id=Object_Id('表名')) 

 

--7、获取表字段的基本信息: 

Select 字段名=rtrim(b.name), 
主键=CASE WHEN h.id IS NOT NULL 
THEN 'PK' ELSE '' END, 
字段类型=type_name(b.xusertype)+CASE WHEN 

b.colstat&1=1 THEN '[ID(' + 
CONVERT(varchar, ident_seed(a.name))+','+CONVERT(varchar,ident_incr(a.name))+')]' ELSE '' END, 

长度=b.length, 
允许空=CASE b.isnullable WHEN 0 THEN 'N' ELSE 'Y' END, 
默认值=isnull(e.text, ''), 
字段说明=isnull(c.value, '') 
FROM sysobjects a, syscolumns b 
LEFT OUTER JOIN sysproperties c ON b.id = c.id AND b.colid = c.smallid 
LEFT OUTER JOIN syscomments e ON b.cdefault = e.id 
LEFT OUTER JOIN 
(Select g.id, g.colid 
FROM sysindexes f, sysindexkeys g 
Where (f.id=g.id)AND(f.indid=g.indid)AND(f.indid>0)AND(f.indid<255)AND(f.status&2048)<>0) h 
ON (b.id=h.id)AND(b.colid=h.colid) 
Where (a.id=b.id)AND(a.id=object_id('要查询的表')) 
orDER BY b.colid 


 

Select 
表名=case when a.colorder=1 then d.name else '' end, 
表说明=case when a.colorder=1 then isnull(f.value,'') else '' end, 

字段序号=a.colorder, 
字段名=a.name, 
标识=case when COLUMNPROPERTY(a.id,a.name,'IsIdentity')=1 then '√' else '' end, 
主键=case when exists(Select 1 FROM sysobjects where xtype='PK' and name in (Select name 
FROM 
sysindexes Where 
indid 
in(Select indid 
FROM 
sysindexkeys 
Where id=a.id AND colid=a.colid))) then '√' else '' end, 
类型=b.name, 
字段长度=a.length, 
占用字节数=COLUMNPROPERTY(a.id,a.name,'PRECISION'), 
小数位数=isnull(COLUMNPROPERTY(a.id,a.name,'Scale'),0), 
允许空=case when a.isnullable=1 then '√'else '' end, 
默认值=isnull(e.text,''), 
字段说明=isnull(g.[value],'') 
FROM syscolumns a 
left join systypes b on a.xusertype=b.xusertype 
inner join sysobjects d on (a.id=d.id)and(d.xtype='U')and(d.name<>'dtproperties') 
left join syscomments e on a.cdefault=e.id 
left join sysproperties g on (a.id=g.id)and(a.colid=g.smallid) 
left join sysproperties f on (d.id=f.id)and(f.smallid=0) 
--where d.name='

