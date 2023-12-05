# UnitEval NG 

Simulation AI-Copilot Experience for UnitEval.

## AI Assistant Programming

### AutoDev: Static Analysis

[Custom Prompt Action](https://ide.unitmesh.cc/custom/action) Elements:

- `${SELECTION}`: the selected code
- `${SIMILAR_CHUNK}`: the similar code chunk
- `${METHOD_INPUT_OUTPUT}`: the method input and output
- `${SPEC_*}`: load spec from spec section in config, like `${SPEC_controller}` will load spec.controller from config.

[Team Prompts](https://ide.unitmesh.cc/custom/team-prompts) Elements:

- selection: 用于获取当前选中的文本。
- commentSymbol: 用于获取当前语言的注释符号，例如：//、#、--、/* */ 等。
- beforeCursor: 用于获取当前光标前的文本。
- afterCursor: 用于获取当前光标后的文本。
- language: 用于获取当前文件的语言，例如：kotlin、java、python、javascript 等。
- fileName: 用于获取当前文件的文件名。
- filePath: 用于获取当前文件的文件路径。
- methodName: 用于获取当前方法的方法名。
- frameworkContext: 用于获取当前文件的框架上下文，例如：spring、junit、mockito 等。

### GitHub Copilot: Similar Chunk

Completion type:

- Inline completion
- In-block completion
- After-block completion

Elements:

- BeforeCursor
- AfterCursor
- SimilarFile
- ImportedFile
- LanguageMarker
- PathMarker
- RetrievalSnippet

### JetBrains AI Assistant: Static Analysis

Elements:

- `$SELECTION`: a Markdown-formatted code block with current code selection and language name.
- `$SELECTION_RAW`: selected code fragment.
- `$SELECTION_LANG`: the language of the currently selected code fragment.
- `$PRODUCT_NAME`: the name of the product that is currently launched, for example, IntelliJ IDEA.

[https://www.jetbrains.com/help/idea/ai-assistant.html#ai_add_custom_prompts](https://www.jetbrains.com/help/idea/ai-assistant.html#ai_add_custom_prompts)

