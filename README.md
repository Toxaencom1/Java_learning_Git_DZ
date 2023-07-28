# Java_learning_Git_DZ
### for Git+ sem1 dz

Commands History:


PS C:\Users\Toxae\IdeaProjects\Java_learning_Git_DZ>git remote -v   

origin  https://github.com/Toxaencom1/Java_learning.git (fetch)

origin  https://github.com/Toxaencom1/Java_learning.git (push)

PS C:\Users\Toxae\IdeaProjects\Java_learning_Git_DZ> git remote remove origin

PS C:\Users\Toxae\IdeaProjects\Java_learning_Git_DZ> git remote -v 

PS C:\Users\Toxae\IdeaProjects\Java_learning_Git_DZ> git remote add origin https://github.com/Toxaencom1/Java_learning_Git_DZ.git

PS C:\Users\Toxae\IdeaProjects\Java_learning_Git_DZ> git remote -v

origin  https://github.com/Toxaencom1/Java_learning_Git_DZ.git (fetch)

origin  https://github.com/Toxaencom1/Java_learning_Git_DZ.git (push)

PS C:\Users\Toxae\IdeaProjects\Java_learning_Git_DZ> git fetch --all

remote: Enumerating objects: 3, done.

remote: Counting objects: 100% (3/3), done.

remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0

Unpacking objects: 100% (3/3), 623 bytes | 77.00 KiB/s, done.

From https://github.com/Toxaencom1/Java_learning_Git_DZ

[new branch]      master     -> origin/master

  PS C:\Users\Toxae\IdeaProjects\Java_learning_Git_DZ> git log origin/master ^master

  commit ef1547c4045db5185db456199fa9bafdebd360ae (origin/master)

  Author: Toxaencom1 <113226824+Toxaencom1@users.noreply.github.com>

  Date:   Fri Jul 28 13:34:10 2023 +0600



  Initial commit

  PS C:\Users\Toxae\IdeaProjects\Java_learning_Git_DZ> git merge origin/master

  fatal: refusing to merge unrelated histories

  PS C:\Users\Toxae\IdeaProjects\Java_learning_Git_DZ> git pull origin master --allow-unrelated-histories

  From https://github.com/Toxaencom1/Java_learning_Git_DZ

branch            master     -> FETCH_HEAD

  Merge made by the 'ort' strategy.

  README.md | 2 ++

  
1 file changed, 2 insertions(+)

  create mode 100644 README.md

  PS C:\Users\Toxae\IdeaProjects\Java_learning_Git_DZ> git push -u origin master

  Enumerating objects: 245, done.

  Counting objects: 100% (245/245), done.

  Delta compression using up to 12 threads

  Compressing objects: 100% (165/165), done.

  Writing objects: 100% (244/244), 35.26 KiB | 2.20 MiB/s, done.

  Total 244 (delta 65), reused 0 (delta 0), pack-reused 0

  remote: Resolving deltas: 100% (65/65), done.

  To https://github.com/Toxaencom1/Java_learning_Git_DZ.git

  ef1547c..991bbff  master -> master

  branch 'master' set up to track 'origin/master'.

  PS C:\Users\Toxae\IdeaProjects\Java_learning_Git_DZ>

