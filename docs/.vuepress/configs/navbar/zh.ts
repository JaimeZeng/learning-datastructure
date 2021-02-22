import type {NavbarConfig} from "vuepress";

export const zh: NavbarConfig = [
    {
        text: " Home",
        link: "/datastructure/",
    },
    {
        text: "阶段一", //阶段一： 算法与数据结构基础
        children: [
            "/datastructure/week01.md",
            "/datastructure/week02.md",
            "/datastructure/week03.md",
            "/datastructure/week04.md",
        ],
    },
];
