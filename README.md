# Chat Application - using Java and NodeJS

[Link to the video explaining how to build the application.](https://www.youtube.com/watch?v=o_IjEDAuo8Y&t=1994s)

The **Chat Server** is in Java and is the backend of the application.

The **Chat Client** is in JavaScript, using NodeJS, and is the frontend of the application.

<hr>

I had to initialise the GitHub repo after creating the folder with the code in it.<br>
[Follow this link's instructions](https://docs.github.com/en/migrations/importing-source-code/using-the-command-line-to-import-source-code/adding-locally-hosted-code-to-github)
to do that.

When pushing this to a remote repo, I had trouble as the Chat Client had been initialised with its own .git file, which
meant I couldn't access the files in GitHub.<br>
That (hidden) file will need to be deleted.

Once deleted, it's not straight forward to commit.<br>
Try a simple git add and commit; if git says there aren't any changes (which is most likely), then the cached command
will need to be used: *git rm --cached {folder}* (The recursive *-r* command may need to be used as).<br>
Then try add, commit and push.

[Useful Link](https://stackoverflow.com/questions/63442245/github-arrow-on-folder-cant-open#:~:text=2%20Answers&text=That%20icon%20is%20to%20indicate,hidden%20items%20and%20click%20it.)
for how to do this.